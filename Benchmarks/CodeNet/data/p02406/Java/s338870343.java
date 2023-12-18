00.05 sec    17348 KB    20 lines     302 bytes    2014-07-30 21:43
?
1
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
import java.util.Scanner;
 
class Main{
public static void main(String[] args){
 
Scanner scan = new Scanner(System.in);
 
int x = scan. nextInt();
 
for(int i = 0; i <= x ; i++){
     if(i%10!=3) continue;
     if(i%3!=0) continue;
 
 
         System.out.print(i +" ");
}
         System.out.println();
}
}