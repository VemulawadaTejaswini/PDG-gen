import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int r=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int[][] rc=new int[r+1][c+1];
for(int i=0;i<r+1;i++){
    for(int j=0;j<c+1;j++){
    rc[i][j]=Integer.parseInt(sc.next());
    }
}

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    rc[i][c]+=rc[i][j];
    }
}
for(int j=0;j<c;j++){
    for(int i=0;i<r;i++){
    rc[r][j]+=rc[i][j];
    }
}

for(int i=0;i<r+1;i++){
    for(int j=0;j<c+1;j++){
    if(i!=c){System.out.print(" "+rc[i][j]+" ");}else{System.out.println(" "+rc[i][j]+" ");}
    }
}

}
}
