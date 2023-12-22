import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
String sent=scan.next();
String[] alph=sent.split("");

int i=0;
int j=0;
for(i=0;i<num;i++){
    for(j=0;j<alph.length;j++){

if(alph[j].equals("A")){
    alph[j]="B";
}
else if(alph[j].equals("B")){
    alph[j]="C";
}
else if(alph[j].equals("C")){
    alph[j]="D";
}
else if(alph[j].equals("D")){
    alph[j]="E";
}
else if(alph[j].equals("E")){
    alph[j]="F";
}
else if(alph[j].equals("F")){
    alph[j]="G";
}
else if(alph[j].equals("G")){
    alph[j]="H";
}
else if(alph[j].equals("H")){
    alph[j]="I";
}
else if(alph[j].equals("I")){
    alph[j]="J";
}
else if(alph[j].equals("J")){
    alph[j]="K";
}
else if(alph[j].equals("K")){
    alph[j]="L";
}
else if(alph[j].equals("L")){
    alph[j]="M";
}
else if(alph[j].equals("M")){
    alph[j]="N";
}
else if(alph[j].equals("N")){
    alph[j]="O";
}
else if(alph[j].equals("O")){
    alph[j]="P";
}
else if(alph[j].equals("P")){
    alph[j]="Q";
}
else if(alph[j].equals("Q")){
    alph[j]="R";
}
else if(alph[j].equals("R")){
    alph[j]="S";
}
else if(alph[j].equals("S")){
    alph[j]="T";
}
else if(alph[j].equals("T")){
    alph[j]="U";
}
else if(alph[j].equals("U")){
    alph[j]="V";
}
else if(alph[j].equals("V")){
    alph[j]="W";
}
else if(alph[j].equals("W")){
    alph[j]="X";
}
else if(alph[j].equals("X")){
    alph[j]="Y";
}
else if(alph[j].equals("Y")){
    alph[j]="Z";
}
else if(alph[j].equals("Z")){
    alph[j]="A";
}

    }
}
String sente=String.join("",alph);
System.out.println(sente);



}
}