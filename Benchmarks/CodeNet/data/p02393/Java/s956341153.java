import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[] integar=new int[3];
for(int i=0; i<integar.length; i++){
integar[i]=scan.nextInt();
}
for(int j=0; j<integar.length; i++){
for(int k=integar.length-1; k>j; k--){
if(integar[k]<integar[k-1]){
int temp=integar[k];
integar[k]=integar[k-1];
integar[k-1]=temp;
}
}
}
System.out.println(integar[0]+""+integar[1]+""+integar[2]);
}
}  