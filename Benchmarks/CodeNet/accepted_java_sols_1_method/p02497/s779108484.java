import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while(true){
        int tyuukan = scan.nextInt();
        int kimatu = scan.nextInt();
        int saisi = scan.nextInt();
        int goukei = tyuukan + kimatu;
       
        if((tyuukan == -1) || (kimatu == -1)){
            if((tyuukan == kimatu) && (saisi == -1)){
                break;
            }else{
            System.out.println("F");
            continue;
            }
        }

        if(goukei >= 80){
            System.out.println("A");
        }else if(goukei >= 65){
            System.out.println("B");
        }else if(goukei >= 50){
            System.out.println("C");
        }else if(goukei >= 30){
            if(saisi >= 50){
              System.out.println("C");
            }else{
              System.out.println("D");
            }
        }else{
            System.out.println("F");
        }
    }
  }
}