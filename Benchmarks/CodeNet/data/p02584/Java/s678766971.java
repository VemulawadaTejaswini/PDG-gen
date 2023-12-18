import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiUnavailableException;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();

    long counter = 0;

    long devide = Math.abs(x / d);
    long plus_nearest;
    long minus_nearest;

    if(devide > k){
      if(x >= 0){
        System.out.println(x - k*d);
      }else{
        System.out.println(Math.abs(x + k*d));
      }
    }else{
      if(x >= 0){
        plus_nearest = x - devide * d;
        minus_nearest = plus_nearest - d;

        if(((k - devide) % 2) == 0){
          System.out.println(plus_nearest);
        }else{
          System.out.println(Math.abs(minus_nearest));
        }
      }else{
        minus_nearest = x + devide * d;
        plus_nearest = minus_nearest + d;

        if(((k - devide) % 2) == 0){
          System.out.println(Math.abs(minus_nearest));
        }else{
          System.out.println(plus_nearest);
        }
      }
    }

    return;

  }
}