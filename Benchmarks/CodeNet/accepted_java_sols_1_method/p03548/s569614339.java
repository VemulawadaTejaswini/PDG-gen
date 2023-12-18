import java.util.*;


class Main{
  
    
  
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     int x = sc.nextInt();
     int y = sc.nextInt();
     int z = sc.nextInt();
     int n = 1; 
      while(x >= n*y + (n+1)*z){
        n++;
    }
     System.out.println(n-1);
	}
}

