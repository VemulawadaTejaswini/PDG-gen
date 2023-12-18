import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public Main() {
    }

    public static void main(String[] args ) {
    		Main main = new Main();
    		main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            exec_body(bf);
        } catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
        finally{
            if( bf != null ) {
                try {
					bf.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
            }
        }
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		// 標準入力から読み取り
        String line = bf.readLine();
        String[] lines = line.split(" ");
        int quantum = Integer.parseInt(lines[1]);

        Queue<Process> pList = new  LinkedList<>();
        while( (line = bf.readLine()) != null ) {
        		lines = line.split(" ");
        		Process p = new Process(lines[0],Integer.parseInt(lines[1]));
        		pList.add(p);
        }

        int time = 0;
        ArrayList<Process> list = new ArrayList<>();
        while( !pList.isEmpty() ) {
        		Process element = pList.poll();
        		if( element._time > quantum ) {
        			element._time = element._time -quantum;
        			pList.add(element);
        			time = time + quantum;
        		} else {
        			time = time + element._time;
        			list.add(new Process(element._name,time));
        		}
        }

        list.forEach((Process element) -> {
        		System.out.println(element._name + " " + element._time );
        });
    }

    public class Process {
    		private String _name = null;
    		private int _time = 0;

    		public Process( String name, int time ) {
    			_name = name;
    			_time = time;
    		}

    		public String getName() {
    			return _name;
    		}

    		public int getTime() {
    			return _time;
    		}
    }
}
