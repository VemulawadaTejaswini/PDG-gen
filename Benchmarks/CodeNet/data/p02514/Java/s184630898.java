import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in).useDelimiter("[ \n\r]+");
		
		while(true) {
			int pageSize = sc.nextInt();
			if(pageSize == 0) break;
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			Map<String, List<Button>> pages = new HashMap<String, List<Button>>(pageSize*2);
			String currentPage = null;
			List<String> pageHistory = new ArrayList<String>(64);
			List<Button> currentButtons = null;
			
			
			for(int i = 0; i < pageSize; i++) {
				String pageName = sc.next();
				
				int buttonSize = sc.nextInt();
				List<Button> list = new LinkedList<Button>();
				for(int j = 0; j < buttonSize; j++) {
					list.add(new Button(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next()));
				}
				if(i == 0) {
					pageHistory.add(pageName);
					currentButtons = list;
				}
				pages.put(pageName, list);
			}
			
			int pointer = 0;
			
			int actionCount = sc.nextInt();
			
			for(int i = 0; i < actionCount; i++) {
				String action = sc.next();
				if(action.equals("click")) {
					int cw = sc.nextInt();
					int ch = sc.nextInt();
				
					for(Button btn : currentButtons) {
						if(btn.beginX <= cw && cw <= btn.endX && btn.beginY <= ch &&ch <= btn.endY) {
							
							pageHistory = pageHistory.subList(0, ++pointer);
							pageHistory.add(btn.to);
							currentButtons = pages.get(btn.to);
							break;
						}
					}
				}
				else if(action.equals("forward")) {
					if(pointer+1 < pageHistory.size()) {
						currentButtons = pages.get(pageHistory.get(++pointer));
					}
				}
				else if(action.equals("back")) {
					if(0 < pointer) {
						currentButtons = pages.get(pageHistory.get(--pointer));
					}
				}
				else if(action.equals("show")) {
					System.out.println(pageHistory.get(pointer));
				}
			}
		}
	}
}

class Button {
	public String to;
	public int beginX;
	public int beginY;
	public int endX;
	public int endY;
	
	public Button(int beginX, int beginY, int endX, int endY, String to) {
		this.to = to;
		this.beginX = beginX;
		this.beginY = beginY;
		this.endX = endX;
		this.endY = endY;
	}
}