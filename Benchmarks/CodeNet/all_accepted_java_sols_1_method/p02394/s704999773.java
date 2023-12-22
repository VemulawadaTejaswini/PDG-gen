import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
List<String> store = new ArrayList<String>();
while(sc.hasNextLine()){
store.add(sc.nextLine());
}
String[] input = store.get(0).split(" "); 
int W = Integer.parseInt(input[0]);
int H = Integer.parseInt(input[1]);
int x = Integer.parseInt(input[2]);
int y = Integer.parseInt(input[3]);
int r = Integer.parseInt(input[4]);
if(x>=r && x<=W-r && y>=r && y<=H-r){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
}