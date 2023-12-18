import java.util.Scanner;                                                                            
                                                                                                     
public class Main{                                                                                   
    public static void main(String args[]){                                                          
        Scanner sc = new Scanner(System.in);                                                         
        String a = "";                                                                               
        String b = sc.next();                                                                        
        if(b .equals("A")){                                                                          
            a = "T";                                                                                 
        }else if(b.equals("C")){                                                                     
            a = "G";                                                                                 
        }else if(b.equals("T")){                                                                     
            a = "A";                                                                                 
        }else if(b.equals("G")){                                                                     
            a = "C";                                                                                 
        }                                                                                            
        System.out.println(a);                                                                       
    }                                                                                                
}    