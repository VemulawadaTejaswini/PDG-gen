import java.util.Scanner;

//Try bubble sort!!
public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] data =new int[1000];
  for(int j=0;j<n;j++){
   data[j]=sc.nextInt();
  }
for(int i=0;i<n-1;i++){
 for(int j=n-1;j>i;j--){
  if(data[j]<data[j-1]){
   int tmp=data[j];
   data[j]=data[j-1];
   data[j-1]=tmp;
   }
  }
  }

for(int k=0;k<n;k++){
 System.out.printf("%d ",data[k]);
}
System.out.printf("\r");
  }
  }