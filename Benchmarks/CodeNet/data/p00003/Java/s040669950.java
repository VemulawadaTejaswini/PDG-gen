
import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int[][] t=new int[N][3];
for(int i=0; i<N; i++){
for(int j=0; j<3; j++){
t[i][j]=sc.nextInt();
}
}
sort(t);

for(int i=0; i<N; i++){
if(t[i][2]*t[i][2]==(t[i][1]*t[i][1]+t[i][0]*t[i][0])){
System.out.println("YES");

}else{
System.out.println("NO");

}
}

    }
    public static void sort(int[][] t){
    int [] s=new int[3];
    for(int i=0; i<t.length; i++){
    for(int j=0; j<3; j++){
    s[j]=t[i][j];
    }
      Arrays.sort(s);
      for(int k=0; k<3; k++){
      t[i][k]=s[k];
      }
    }
    }
}