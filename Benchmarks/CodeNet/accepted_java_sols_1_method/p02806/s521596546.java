import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //first input is number of songs; use a for loop with the length
    int num = sc.nextInt();
    String[] songArray = new String[num];
    int[] songLength = new int[num];

    //sc.next(); and sc.nextInt();
    for(int i = 0; i < num; i++){
      songArray[i] = sc.next();
      songLength[i] = sc.nextInt();
    }
    //take in song name
    String endSong = sc.next();

    /*
    System.out.println(num);
    for( String each : songArray ){
      System.out.println(each);
    }
    for( int each : songLength ){
      System.out.println(each);
    }
    System.out.println(endSong);
    */

    boolean afterEndSong = false;
    int total = 0;
    for(int i = 0; i < num; i++){
      if( afterEndSong ){
        total += songLength[i];
      }
      if( songArray[i].equals(endSong) ){
        afterEndSong = true;
      }
    }

    System.out.println(total);

  }
}