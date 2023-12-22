import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		int max = 0;
		String[] word = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
		    String str2 = String.valueOf(str.charAt(i));
		    // 配列に順番に格納する
		    word[i] = str2;
		}

		for(int i=0; i<str.length(); i++){
			for(int j=i; j<str.length();j++){
				if(count==0){
					if((word[j].equals("A"))||(word[j].equals("C"))||(word[j].equals("G"))||(word[j].equals("T"))){
						count++;
					}
				}else{
					if((word[j].equals("A"))||(word[j].equals("C"))||(word[j].equals("G"))||(word[j].equals("T"))){
						count++;
					}else{
						if(max<count){
							max=count;
						}
						count=0;
					}
				}
			}
			if(max<count){
				max=count;
			}
			count=0;
		}
		System.out.println(max);
	}
}


		
