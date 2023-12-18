import java.io.*;

class Main{
public static void main(String[] args) throws IOException
{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
int space = str.indexOf(" ");
String str1 = str.substring(0, space);
String str2 = str.substring(space+1, str.length());
int n = Integer.parseInt(str1);
int b = Integer.parseInt(str2);
int count = 0;
for ( int i = 1; i <= n; i++ ) {
    for ( int j = 1; j <= n; j++) {
        for ( int k = 1; k <= n; k++) {
	if(i < j && j < k)
	if(i+j+k == b)
	count++;
    
        }
    }
}
System.out.println(count);

}
}