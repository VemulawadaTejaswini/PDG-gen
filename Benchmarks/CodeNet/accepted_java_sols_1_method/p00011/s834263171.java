import java.util.Scanner;

public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int w = sc.nextInt();
int n = sc.nextInt();
int amida [] = new int [w];
for(int i =0; i<w; i++){
  amida[i] = i+1;
}
for(int i =0; i< n; i++){
String hon = sc.next();
char c [] = hon.toCharArray();
String line1 = "";
String line2 = "";
int flag  = 0;
for(int k = 0; k<hon.length(); k++){
  if(c[k]==','){ flag++;}
  else if(flag == 0 ){ line1 += c[k];}
  else if(flag == 1) {line2 += c[k];}
}
int m1 = Integer.parseInt(line1);
int m2 = Integer.parseInt(line2);
int connect = 0;
connect = amida[m1-1];
amida[m1-1]=amida[m2-1];
amida[m2-1] = connect;
}
for(int i =0; i<w; i++){
  System.out.println(amida[i]);
}

}
}

