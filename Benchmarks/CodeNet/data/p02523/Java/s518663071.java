import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
int space1 = str.indexOf(" ");
int space2 = str.indexOf(" ", space1+1);
int space3 = str.indexOf(" ", space2+1);


double x1 = Double.parseDouble(str.substring(0, space1));
double y1 = Double.parseDouble(str.substring(space1+1, space2));
double x2 = Double.parseDouble(str.substring(space2+1, space3));
double y2 = Double.parseDouble(str.substring(space3+1));

double ans = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

System.out.println(ans);
}
}