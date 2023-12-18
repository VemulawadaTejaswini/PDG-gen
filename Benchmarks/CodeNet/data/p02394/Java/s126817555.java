import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[] rect=new int[2];
int[] circle=new int[3];
for(int i=0; i<rect.length+circle.length; i++){
if(i<2){
rect[i]=scan.nextInt();
}else{
circle[i-2]=scan.nextInt();
}
}
if(circle[0]=<0||circle[1]=<0||circle[0]-circle[2]<0||circle[1]-circle[2]<0){
System.out.println("No");
}
else if(circle[0]+circle[2]>rect[0]||circle[1]+circle[2]>rect[1]){
System.out.println("No");
}else{
System.out.println("Yes");
}
}
}  