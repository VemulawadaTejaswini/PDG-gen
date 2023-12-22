    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) throws Exception {    
          
        Date boundaryDate = ConvertDateFromString("2019/04/30");
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int result = ConvertDateFromString(input).compareTo(boundaryDate);
     
        if ((result == -1) || (result == 0)) {
          System.out.println("Heisei");
        } else {
          System.out.println("TBD");
        }
     
        scanner.close();
     
    }
     
      public static Date ConvertDateFromString(String dateStr) throws Exception {
     
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
     
            // Date型変換
    	Date formatDate = sdf.parse(dateStr);
            return formatDate;
        }
    }