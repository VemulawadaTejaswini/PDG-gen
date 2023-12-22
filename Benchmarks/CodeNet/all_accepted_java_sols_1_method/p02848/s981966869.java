import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	String str= sc.next();
      	char tmp;
      	String output="";
      	for(int i=0;i<str.length();i++)
        {
          	tmp=str.charAt(i);
          	
          	if(64<(byte)tmp && (byte)tmp<91)
            {
              	if((byte)tmp+a>90)
                {
                  output=output+(char)((byte)tmp+a-26);
                }
      			else
                {
                  output=output+(char)((byte)tmp+a);
                }
            }          	
        }
      	System.out.println(output);
	}
}