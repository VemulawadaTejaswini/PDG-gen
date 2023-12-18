import java.util.Scanner;
class Main
{
public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int a[][] = new int[n][m];
  int b[] = new int[m];
  long c;
  int i, j;
  
  for(i=0;i<n;i++){
    for(j=0;j<m;j++){
      a[i][j]=sc.nextInt();
    }
  }
  for(j=0;j<m;j++){
    b[j]=sc.nextInt();
  }
  for(i=0;i<n;i++){
   c=0;
    for(j=0;j<m;j++){
      c+= a[i][j]*b[j];
    }
   System.out.println(c);
  }
}
}

