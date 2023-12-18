//Volume0-0048
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//declare
		float weight;
		String class_;
		
		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			weight = sc.nextFloat();
			
			//calculate
			class_ = null;
			if     (91.00 < weight){class_ = "heavy";       }
			else if(81.00 < weight){class_ = "light heavy"; }
			else if(75.00 < weight){class_ = "middle";      }
			else if(69.00 < weight){class_ = "light middle";}
			else if(64.00 < weight){class_ = "welter";      }
			else if(60.00 < weight){class_ = "light welter";}
			else if(57.00 < weight){class_ = "light";       }
			else if(54.00 < weight){class_ = "feather";     }
			else if(51.00 < weight){class_ = "bantam";      }
			else if(48.00 < weight){class_ = "fly";         }
			else                   {class_ = "light fly";   }
			
			//output
			System.out.println(class_);
		}
	}
}