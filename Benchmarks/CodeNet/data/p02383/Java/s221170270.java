import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Dice d = new Dice();
    d.input();
    String ops = scanner.nextLine();
    for(int i = 0;i<ops.length();i++){
      if(ops.charAt(i) == 'E'){
        d.E();
      }
      if(ops.charAt(i) == 'N'){
        d.N();
      }
      if(ops.charAt(i) == 'S'){
        d.S();
      }
      if(ops.charAt(i) == 'W'){
        d.W();
      }
    }
    d.PrintTop();

  }
}

class Dice{
  int top,down,right,left,up,bottom;
  int b_top,b_down,b_right,b_left,b_up,b_bottom;

  public void input(){
    Scanner scanner = new Scanner(System.in);
    this.top=  scanner.nextInt();
    this.down =  scanner.nextInt();
    this.right =  scanner.nextInt();
    this.left =  scanner.nextInt();
    this.up =  scanner.nextInt();
    this.bottom =  scanner.nextInt();

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void PrintTop(){
    System.out.println(this.top);
  }

  public void E(){
    this.top = this.b_left;
    this.down =  this.b_down;
    this.right =  this.b_top;
    this.left =  this.b_bottom;
    this.up =  this.b_up;
    this.bottom =  this.b_right;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void W(){
    this.top = this.b_right;
    this.down =  this.b_down;
    this.right =  this.b_bottom;
    this.left =  this.b_top;
    this.up =  this.b_up;
    this.bottom =  this.b_left;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void N(){
    this.top = this.b_down;
    this.down =  this.b_bottom;
    this.right =  this.b_right;
    this.left =  this.b_left;
    this.up =  this.b_top;
    this.bottom =  this.b_up;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }

  public void S(){
    this.top = this.b_up;
    this.down =  this.b_top;
    this.right =  this.b_right;
    this.left =  this.b_left;
    this.up =  this.b_bottom;
    this.bottom =  this.b_down;

    this.b_top = this.top;
    this.b_down = this.down;
    this.b_right = this.right;
    this.b_left = this.left;
    this.b_up = this.up;
    this.b_bottom = this.bottom;
  }
}
