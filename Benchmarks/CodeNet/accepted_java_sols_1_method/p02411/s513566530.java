import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A[] = new int[100];
    int B[] = new int[100];
    int C[] = new int[100];
    int i=0;

    do{
      A[i] = scanner.nextInt();
      B[i] = scanner.nextInt();
      C[i] = scanner.nextInt();
      i++;
    }while(!(A[i-1]==-1&&B[i-1]==-1&&C[i-1]==-1));

    for(int j=0;j<i-1;j++){
      if(A[j]==-1||B[j]==-1||A[j]+B[j]<30){System.out.println("F");}
      else if(A[j]+B[j]<50&&C[j]<50){System.out.println("D");}
      else if(A[j]+B[j]<65||C[j]>=50){System.out.println("C");}
      else if(A[j]+B[j]<80){System.out.println("B");}
      else{System.out.println("A");}
    }
  }
}
