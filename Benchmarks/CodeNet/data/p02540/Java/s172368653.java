import java.util.Scanner;
 public class Main { 	public static void main(String[] args) { 		
int ans = 0; 		
Scanner sc = new Scanner(System.in); 		int n = sc.nextInt(); 
int hako[2][n];
int ans[n];
		 	for(int i=1;i<=n;i++) { 
    hako[0][n]=sc.nextInt();
    hako[1][n]=sc.nextInt();
} 		 		
for(int i=1;i<=n;i++) { 			
  for(int j=1;j<=n;j++) { 				
         if(hako[0][i] > hako[0][j] &&
hako[1][i] > hako[1][j] || 
hako[0][i] < hako[0][j] &&
hako[1][i] > hako[1][j]） { 					
             ans[i]++; 				
           } 
} 		
}
for(int i=0;i<n;i++){
System.out.println(ans[i]);
}
 	
 }
} 
