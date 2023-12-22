import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		int y=0;
		while (scanner.hasNextLine()) {
			String sc = scanner.nextLine();
			y++;
			if(y>=2){
			list.add(sc);
			}
		}
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size();) {
                if (list.get(i).equals(list.get(j))){
                    System.out.print("No");
	    	        System.exit(0);
                } else {
                    ++j;
                }
            }
        }
	    char last;
	    char first;
	    String[] list3 = list.toArray(new String[list.size()]);
		for(int k=1;k<list.size();k++){
	    	first = list3[k].charAt(0);
	    	last = list3[k-1].charAt(list3[k-1].length()-1);
	    	if(last!=first){
	    		System.out.print("No");
	    		System.exit(0);
	    	}
		}
        System.out.print("Yes");
	}
}
	    