import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        	String sent = sc.nextLine();
        	if(sent.equals("END OF INPUT"))break;
        	String[] sent2 = sent.split(" ") ;//" "??§?????????
        	for(int i=0;i<sent2.length;i++){//???????????°
        		System.out.print(sent2[i].length());//??????????????????
        	}
        	System.out.println();
        }
    }
 
}