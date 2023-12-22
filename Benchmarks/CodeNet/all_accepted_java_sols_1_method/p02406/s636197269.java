import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        
        for(int i = 1;i <= num1;i++){
            if(i % 3 == 0)  System.out.print(" "+i);
            else{
                String s = String.valueOf(i);
                if(s.contains("3")) System.out.print(" "+i);
            }
        }
        System.out.print("\n");
    }
}

