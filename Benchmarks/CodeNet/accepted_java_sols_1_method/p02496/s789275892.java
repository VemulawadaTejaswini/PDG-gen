import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

boolean[] s = new boolean[13];
boolean[] h = new boolean[13];

boolean[] c = new boolean[13];

boolean[] d = new boolean[13];


String str = br.readLine();
int n = Integer.parseInt(str);

for(int k = 0; k < n; k++){
str = br.readLine();
int space = str.indexOf(" ");
String str1 = str.substring(0, space);
String str2 = str.substring(space+1, str.length());

int a = Integer.parseInt(str2);
a = a-1;

if(str1.equals("S")){
s[a] = true;
}
if(str1.equals("H")){
h[a] = true;
}

if(str1.equals("C")){
c[a] = true;
}

if(str1.equals("D")){
d[a] = true;
}


}

for(int i = 0; i < 13; i++){
 if(!s[i++])
System.out.println("S "+i);
i--;

}
for(int i = 0; i < 13; i++){
 if(!h[i++])
System.out.println("H "+i);
i--;

}
for(int i = 0; i < 13; i++){
 if(!c[i++])
System.out.println("C "+i);
i--;

}
for(int i = 0; i < 13; i++){
 if(!d[i++])
System.out.println("D "+i);
i--;

}


}}