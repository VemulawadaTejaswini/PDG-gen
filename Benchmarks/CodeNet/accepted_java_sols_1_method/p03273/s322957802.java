import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int H = Integer.parseInt(sc.next());
int W = Integer.parseInt(sc.next());
char[][] a=new char[H][W];
    for (int i = 0; i < H; i++) {
        String p=sc.next();
        for (int j = 0; j < W; j++) {
            a[i][j]=p.charAt(j);
        }
    }
    for (int i = 0; i < H; i++) {
        int c=0;
        for (int j = 0; j <W ; j++) {
            if(a[i][j]=='.')c++;
        }
        if(c==W){
            for (int j = 0; j < W; j++) {
                a[i][j]='-';
            }
        }
    }
    for (int i = 0; i < W; i++) {
        int c=0;
        for (int j = 0; j < H; j++) {
            if(a[j][i]=='.'||a[j][i]=='-')c++;
        }
        if(c==H){
            for (int j = 0; j < H; j++) {
                a[j][i]='-';
            }
        }
    }
    String[] s=new String[H];
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            s[i]+=Character.toString(a[i][j]);
        }
    }
    for (int i = 0; i <H; i++) {
        s[i]=s[i].replaceAll("-","");
    s[i]=s[i].replaceAll("null","");
    }
    for (int i = 0; i < H; i++) {
        if(s[i].contains(".")||s[i].contains("#"))out.println(s[i]);
    }
    
}}