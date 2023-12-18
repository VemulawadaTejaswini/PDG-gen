// ???????????? I
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		
		// ?????????????????????
		Dise dise = new Dise();
		// ?????¢?????°??????????????????
		for(int i = 0; i < 6; i++) {
			dise._values[i] = scan.nextInt();
		}
		// ?????????????????????
		String s = scan.next();
		int l = s.length();
		for(int i = 0; i<l; i++){
			String meirei = s.substring(i, i+1);
			int lx =0;
			if(meirei.equals("S")){
				dise.MoveSouth();
			}
			else if(meirei.equals("N")){
				dise.MoveNorth();
			}
			else if(meirei.equals("W")){
				dise.MoveWest();
			}
			else if(meirei.equals("E")){
				dise.MoveEast();
			}
		}
		System.out.println(dise._values[0]);
		
		
	}
}

// ??????????????????
class Dise {

	public int _values[] = new int[6];
	
	public void Dice(int values[]) {
    	for (int i = 0; i < values.length; i++)
    	this._values[i] = values[i];
	}
    
    public enum ValueType
    {
        Top,
        Front,
        Right,
        Left,
        Back,
        Bottom
    }
    
    // memo 0:top, 1:front, 2:r, 3:l, 4:back, 5under
    public void MoveWest()
    {
        int tmp = this._values[0];
        this._values[0] = this._values[2];
        this._values[2] = this._values[5];
        this._values[5] = this._values[3];
        this._values[3] = tmp;
    }
    public void MoveEast()
    {
        int tmp = this._values[0];
        this._values[0] = this._values[3];
        this._values[3] = this._values[5];
        this._values[5] = this._values[2];
        this._values[2] = tmp;
    }
    public void MoveNorth()
    {
        int tmp = this._values[0];
        this._values[0] = this._values[1];
        this._values[1] = this._values[5];
        this._values[5] = this._values[4];
        this._values[4] = tmp;
    }
    public void MoveSouth()
    {
        int tmp = this._values[0];
        this._values[0] = this._values[4];
        this._values[4] = this._values[5];
        this._values[5] = this._values[1];
        this._values[1] = tmp;
    }


}