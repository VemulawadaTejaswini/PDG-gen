/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foxy
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.next());
    int out = 0;
    int runner = 0;
    boolean change = false;
    int score = 0;
    do{
        String event = s.next();
        if(change){
            score = 0;
            out = 0;
            runner = 0;
            change = false;
        }
        if(event.equals("HIT")){
            if(runner == 3){score++;}
            else {runner++;}
        }
        else if(event.equals("HOMERUN")){
            score += (1 + runner);
            runner = 0;
        }
        else if(event.equals("OUT")){
            out++;
            if(out == 3){
                change = true;
                System.out.println(score);
                n--;
            }
        }
    }while(n>0);
  }
}
