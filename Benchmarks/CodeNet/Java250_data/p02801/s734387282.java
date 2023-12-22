import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String a = sc.next();
      	String[] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      	for(int i = 0;i<27;i++){
        	String b = list[i];
          	if(a == "z"){
            	break;
            }else if(a.equals(b)){
            	System.out.println(list[i+1]);
              	break;
            }
        }
    }
}