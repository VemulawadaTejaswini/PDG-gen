import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blood[]=new int[4];
        while(sc.hasNext()){
        	String n=sc.next();
        	String[] type=n.split(",");
        	if(type[1].equals("A"))blood[0]++;
        	if(type[1].equals("B"))blood[1]++;
        	if(type[1].equals("AB"))blood[2]++;
        	if(type[1].equals("O"))blood[3]++;
        }   
        for(int i=0;i<4;i++){
        	System.out.println(blood[i]);
        }
        
    }
}