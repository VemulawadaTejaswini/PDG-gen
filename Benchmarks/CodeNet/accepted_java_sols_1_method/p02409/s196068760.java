import java.util.Scanner;
  
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        int [][][] build = new int [4][3][10];
        int tatemon,floo,roo;
  
        for(tatemon = 0; tatemon < 4; tatemon++){
            for(floo = 0; floo < 3; floo++){
                for(roo = 0; roo < 10; roo++){
  
                build [tatemon][floo][roo] = 0;
  
                }
            }
        }
  
        int n = scan.nextInt();
        int tatemono = 0;
        int floor= 0;
        int room = 0;
        int info,person;
        String result;
  
        for(info = 0; info < n; info++){
                     
        tatemono = scan.nextInt();
        floor = scan.nextInt();
        room = scan.nextInt();
        person = scan.nextInt();
        build [tatemono-1][floor-1][room-1] = build [tatemono-1][floor-1][room-1]+person;
        }
          
                 
        for(tatemon = 0; tatemon < 4; tatemon++){
            for(floo = 0; floo < 3; floo++){
                for(roo = 0; roo < 10; roo++){ 
                      
                result = " "+build [tatemon][floo][roo];
                      
                /*switch(tatemono){
                 case 1: 
                System.out.print(result);
                break;       
                 case 2:
                System.out.print(result);
                break;       
                case 3:
                System.out.print(result);
                break;           
                case 4:
                System.out.print(result);
                break;       
                default:    
                } */
                System.out.print(result);
                }
                System.out.println();
            }
            if(tatemon < 3){
            System.out.println("####################");
            }
        }
         
    }
}