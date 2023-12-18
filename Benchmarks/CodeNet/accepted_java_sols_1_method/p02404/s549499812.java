import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();
while(!("0 0".equals(line))){
String[] inputs = line.split(" ");
int height = Integer.valueOf(inputs[0]);
int width = Integer.valueOf(inputs[1]);
StringBuilder result = new StringBuilder();
for(int i=0;i<height;i++){
for(int j=0;j<width;j++){
if(i==0||i==height-1||j==0||j==width-1) result.append("#");
else result.append(".");
}
result.append("\n");
}
System.out.println(result);
line = sc.nextLine();
}
}
}
