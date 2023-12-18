import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int ans[] = new int[n];
    int middle = n/2;
    ans[middle] = Integer.parseInt(sc.next());
    int diff = n%2 == 0? -1: 1;
    int j = 1;
	
    for(int i = 1; i < n; i++){
      ans[middle + j*diff] = Integer.parseInt(sc.next());
      diff *= -1;
      if(i > 1 && i % 2 == 0) j++;
    }
    
    StringBuilder line = new StringBuilder();
    for(int i = 0; i < n; i++) line.append(Integer.toString(ans[i]) + " ");
	System.out.println(line);
  } 
  
}