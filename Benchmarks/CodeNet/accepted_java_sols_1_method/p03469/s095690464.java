import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
        String b = "";
        String data[] = a.split("");
        	for(int i = 0;data.length > i;i++){
              if(i == 3){
                data[i] = "8";
                b=b+data[i];
                
              }else{
                b=b+data[i];
              }
            }
        System.out.println(b);
    }
}
