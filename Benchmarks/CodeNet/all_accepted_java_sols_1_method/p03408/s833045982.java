import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
String[] s = new String[N];
for(int i = 0;i < N;i++){
s[i] = sc.next();
}
int M = sc.nextInt();
String[] t = new String[M];
for(int i = 0;i < M;i++){
t[i] = sc.next();
}
int[] score = new int[N];
Arrays.fill(score, 0);
for(int i = 0;i < N;i++){
 for(int j = 0;j < N;j++){
 if(s[i].equals(s[j])){score[i] = score[i] + 1;}
 }
}
for(int i = 0;i < N;i++){
 for(int j = 0;j < M;j++){
 if(s[i].equals(t[j])){score[i] = score[i] - 1;}
 }
}
Arrays.sort(score);
if(score[N-1] >= 0){
System.out.println(score[N-1]);
}
else{
System.out.println("0");
}

}
}
