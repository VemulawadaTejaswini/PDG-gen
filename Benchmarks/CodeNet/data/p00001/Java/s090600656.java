import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int[] list = new int[10];
    	
    	for(int i=0; i<10; i++)
    		list[i] = scn.nextInt();
    	
    	Arrays.sort(list);
    	
    	for(int i=0; i<3; i++)
    		System.out.println(list[9-i]);
    }
}