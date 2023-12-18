import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int r=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int[][] rc=new int[r+1][c+1];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    rc[i][j]=sc.nextInt();
   
    }
}
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
 rc[i][c]+=rc[i][j];
    rc[r][j]+=rc[i][j];
   rc[r][c]+=rc[i][j];
    }
}

for(int j=0;j<r+1;j++){
    for(int i=0;i<c+1;i++){
    if(i!=c){System.out.print(rc[j][i]+" ");}else{System.out.println(rc[j][i]);}
    }
}

}
}
