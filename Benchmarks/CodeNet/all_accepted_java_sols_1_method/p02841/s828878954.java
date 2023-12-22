        import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
    	  String n = sc.nextLine();
          boolean b1 = false;
          boolean b2 = false;
          boolean b3 = false;
          boolean b4 = false;
          String[] strArray = n.split(" ");
                //day
                  switch (strArray[1]) {
            		case "30":
                	b1 = true;
                	break;
            		case "31":
                	b2 = true;
                	break;
           			case "28":
                	b3 = true;
                	break;
            		default:
                    b1 = false;
               		b2 = false;
                    b3 = false;
                  }
            
            switch (strArray[0]) {
              case "4":
              case "6":
              case "9":
              case "11":
                if (b1 == true){
                	b4 = true;
                }
                	break;
            		case "1":
                case "3":
                case "5":
                case "7":
                case "8":
                case "10":
                case "12":
                	if (b2 == true){
                	b4 = true;
                }
                	break;
           			case "2":
                	if (b3 == true){
                	b4 = true;
                }
                break;
            		default:
               		b4 = false;
                    break;
           }
          if (((b1 == true) || (b2 == true) || (b3 == true)) && b4 == true){
           System.out.println("1");
          }
          else{
            System.out.println("0");
          }
        }
    }