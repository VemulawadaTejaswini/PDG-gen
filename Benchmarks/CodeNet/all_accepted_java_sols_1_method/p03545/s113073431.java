import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.next();
int d=Character.getNumericValue(s.charAt(3));
int c=Character.getNumericValue(s.charAt(2));
int b=Character.getNumericValue(s.charAt(1));
int a=Character.getNumericValue(s.charAt(0));
String op1="",op2="",op3="";
if(a+b+c+d==7){op1="+";op2="+";op3="+";
}else if(a+b+c-d==7){op1="+";op2="+";op3="-";
}else if(a+b-c+d==7){op1="+";op2="-";op3="+";
}else if(a-b+c+d==7){op1="-";op2="+";op3="+";
}else if(a+b-c-d==7){op1="+";op2="-";op3="-";
}else if(a-b+c-d==7){op1="-";op2="+";op3="-";
}else if(a-b-c+d==7){op1="-";op2="-";op3="+";
}else{op1="-";op2="-";op3="-";}
System.out.println(a+op1+b+op2+c+op3+d+"=7");
}}