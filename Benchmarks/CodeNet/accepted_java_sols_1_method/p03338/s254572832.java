import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int shurui,max=0;
int N=Integer.parseInt(sc.next());
String S=sc.next();
    for(int I=0;I<N;I++){
    String SS=S.substring(0,I+1);
    String SSS=S.substring(I+1,N);
    shurui=0;
    if(SSS.contains("a")&&SS.contains("a"))shurui++;
    if(SSS.contains("b")&&SS.contains("b"))shurui++;
    if(SSS.contains("c")&&SS.contains("c"))shurui++;
    if(SSS.contains("d")&&SS.contains("d"))shurui++;
    if(SSS.contains("e")&&SS.contains("e"))shurui++;
    if(SSS.contains("f")&&SS.contains("f"))shurui++;
    if(SSS.contains("g")&&SS.contains("g"))shurui++;
    if(SSS.contains("h")&&SS.contains("h"))shurui++;
    if(SSS.contains("i")&&SS.contains("i"))shurui++;
    if(SSS.contains("j")&&SS.contains("j"))shurui++;
    if(SSS.contains("k")&&SS.contains("k"))shurui++;
    if(SSS.contains("l")&&SS.contains("l"))shurui++;
    if(SSS.contains("m")&&SS.contains("m"))shurui++;
    if(SSS.contains("n")&&SS.contains("n"))shurui++;
    if(SSS.contains("o")&&SS.contains("o"))shurui++;
    if(SSS.contains("p")&&SS.contains("p"))shurui++;
    if(SSS.contains("q")&&SS.contains("q"))shurui++;
    if(SSS.contains("r")&&SS.contains("r"))shurui++;
    if(SSS.contains("s")&&SS.contains("s"))shurui++;
    if(SSS.contains("t")&&SS.contains("t"))shurui++;
    if(SSS.contains("u")&&SS.contains("u"))shurui++;
    if(SSS.contains("v")&&SS.contains("v"))shurui++;
    if(SSS.contains("w")&&SS.contains("w"))shurui++;
    if(SSS.contains("x")&&SS.contains("x"))shurui++;
    if(SSS.contains("y")&&SS.contains("y"))shurui++;
    if(SSS.contains("z")&&SS.contains("z"))shurui++;
    max=Math.max(shurui, max);
    }
System.out.println(max);
}
}