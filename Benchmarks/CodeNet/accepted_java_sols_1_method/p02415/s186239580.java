import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String str = scanner.nextLine();
    String sup;
    char Ans[] = new char[10000];


    for(int i=0;i<str.length();i++){
      sup = String.valueOf(str.charAt(i));
      if(Character.isUpperCase(str.charAt(i))){
        Ans[i] = Character.toLowerCase(str.charAt(i));
      }else if(Character.isLowerCase(str.charAt(i))){
      Ans[i] = Character.toUpperCase(str.charAt(i));
      }else{
        Ans[i] = str.charAt(i);
      }
    }

    for(int i=0;i<str.length();i++){
      System.out.print(Ans[i]);
    }

    System.out.println();

  }
}

