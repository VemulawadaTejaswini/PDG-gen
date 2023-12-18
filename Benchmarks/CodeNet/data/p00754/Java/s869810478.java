import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.nextLine();
			if(s.compareTo(".")==0) break;
			
			ArrayList<String> list = new ArrayList<String>();
			
			for(int i=0;i<s.length();i++) list.add(s.substring(i,i+1));
			
			boolean flag = true;
			boolean out = true;

			for(int i=0;i<list.size();i++){
				if(list.indexOf(")")==-1 && list.indexOf("]")==-1 && list.indexOf("(")==-1 && list.indexOf("[")==-1) break;
				if(list.get(i).compareTo(")")==0){
					out = true;
					for(int j=i;j>=0;j--){
						if(list.get(j).compareTo("(")==0){
							list.remove(i);
							list.remove(j);
							i-=2;
							out = false;
							break;
						}else if(list.get(j).compareTo("[")==0){
							break;
						}
					}
					if(out==true) flag = false;
				}else if(list.get(i).compareTo("]")==0){
					out = true;
					for(int j=i;j>=0;j--){
						if(list.get(j).compareTo("[")==0){
							list.remove(i);
							list.remove(j);
							i-=2;
							out = false;
							break;
						}else if(list.get(i).compareTo("(")==0){
							break;
						}
					}
					if(out==true) flag = false;
				}
				if(flag==false) break;
				
			}
			if(list.indexOf(")")!=-1 || list.indexOf("]")!=-1 || list.indexOf("(")!=-1 || list.indexOf("[")!=-1) flag = false;
			
			if(flag==true) System.out.println("yes");
			else System.out.println("no");
		}
	}	
}