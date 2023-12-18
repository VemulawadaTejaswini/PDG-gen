import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String in=input.next();
      StringBuilder Builder=new StringBuilder();
      for(int i=0;i<in.length();++i){
        if(in.charAt(i)=='?'){
          Builder.append('D');
        }else{
          Builder.append(in.charAt(i));
        }
      }System.out.println(Builder.toString());
    }
}