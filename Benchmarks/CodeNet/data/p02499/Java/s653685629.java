import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
       	int[] b=new int[30];
       	for(int i=0;i<30;i++)b[i]=0;
        for(int i=0;i<st.length();i++){
        	char c=st.charAt(i);
            if('A'<=c&&c<='Z')c=Character.toLowerCase(c);
            if('a'<=c&&c<='z')b[c-'a']++;
        }
       	for(int i=0;i<26;i++){
       		System.out.println((char)('a'+i)+"  : "+b[i]);
       	}
     }
}