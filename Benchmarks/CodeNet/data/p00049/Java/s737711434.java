// 血液型グループ
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int[] blood = new int[4];
	int i=1;
	while(kbd.hasNext()){
	    String p = kbd.nextLine();
	    int x = 2;
	    int y = p.length();
	    if(i>=10) x++;
	    if(i>=100) x++;

	    p = p.substring(x, y);
	    //System.out.println(p);
	    if(p.equals("A")) blood[0]++;
	    else if(p.equals("B")) blood[1]++;
	    else if(p.equals("AB")) blood[2]++;
	    else if(p.equals("O")) blood[3]++;
	    
	    i++;
	}
	
	for(i=0; i<blood.length; i++)
	    System.out.println(blood[i]);
    }
}