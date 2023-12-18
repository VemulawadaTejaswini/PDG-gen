class Main{
  public static void main(String[] args){
    String w=new java.util.Scanner(System.in).next();
    int a=0;
    if(w.equals("SSS")){}
    else if(w.equals("SRR")||w.equals("RRS")){a=2;}
    else if(w.equals("RRR")){a=3;}
    else{a=1;}
    System.out.println(a);
  }
}
