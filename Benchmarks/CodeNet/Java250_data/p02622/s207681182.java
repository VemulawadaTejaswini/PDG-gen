import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str1  =  sc.next();
		String str2  =  sc.next();
      	int num = str1.length();
      
      	int cnt = 0;
      	char[] ary1 = new char[num];
      	char[] ary2 = new char[num];

      	for(int i = 0; i < str1.length() ; i++){
        	ary1[i] = str1.charAt(i);
        	ary2[i] = str2.charAt(i);

          	if(ary1[i] != ary2[i]){
            	cnt++;
            }
        }
      	System.out.println(cnt);
    }
}