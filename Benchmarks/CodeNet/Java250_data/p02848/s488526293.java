import java.util.Scanner;
class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    int N = (sc.nextInt())%26;
    char array[] = sc.next().toCharArray();
    int newarray[] = new int[array.length];

    String result = "";
    for(int i = 0; i < array.length; i++){
      newarray[i] = (int)array[i] + N;
      if(newarray[i] >= 91){
        newarray[i] = newarray[i] - 91 + 65;
      }
      result += (char)newarray[i];
    }

    System.out.println(result);
  }
}