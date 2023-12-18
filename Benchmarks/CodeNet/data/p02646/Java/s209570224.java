import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	float aP = sc.nextFloat();
      	float aT = sc.nextFloat();
      	float bP = sc.nextFloat();
      	float bT = sc.nextFloat();
      	float time = sc.nextFloat();
      	float[] fin = new float[2];
      	fin[0] = aT*time+aP;
      	fin[1] = bT*time+bP;
      	float judge = fin[0] - fin[1];
      	if(judge >= 0){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}