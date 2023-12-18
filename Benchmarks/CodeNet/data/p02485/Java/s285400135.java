import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
        	int Sum=0;
        	String st=s.nextLine();
        	if(st.equals("0"))break;
        	else {
        		for(int i=0;i<st.length();i++){
        		char c=st.charAt(i);
        		Sum+=(c-'0');
        		}
        	}
            System.out.println(Sum);
        }
    }
}