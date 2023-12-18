2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
 
import java.io.*;
  
class Main {
public static void main (String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] strArr = br.readLine().split(" ");
int[] numArr = {
Integer.parseInt(strArr[0]),
 Integer.parseInt(strArr[2])
};
int i, j, temp;
for (i = 0; i < 2; i++) {
for (j = 0; j < 2 - i; j++) {
if (numArr[j] > numArr[j+1]) {
temp = numArr[j];
numArr[j] = numArr[j+1];
numArr[j+1] = temp;
}
}
 System.out.println(numArr[0]+" "+numArr[1]+" "+numArr[2]);
}
}
 