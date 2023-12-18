/*
 * Aizu Online Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yoshkur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataController controller = new DataController();
            controller.setDataFromLines(br);
            br.close();
            System.out.println(controller.getResult());

        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}

class DataService {

    private List<DataEntity> entities = new ArrayList<>();
    private DataEntity entity;

    public DataService() {
    }

    public List<DataEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<DataEntity> entities) {
        this.entities = entities;
    }

    public DataEntity getEntity() {
        if (this.entity == null) {
            this.entity = new DataEntity();
        }
        return entity;
    }

    public void setEntity(DataEntity entity) {
        this.entity = entity;
    }
}

class DataEntity {

    private Long a;
    private Long b;
    private String operand;

    public DataEntity() {
    }

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

}

class DataController {

    private static final String RETCODE = System.getProperty("line.separator");
    public static final String SEPARATOR = " ";

    private final DataService ejb;

    public DataController() {
        this.ejb = new DataService();
    }

    public void setDataFromLine(BufferedReader br) throws IOException {
        Double number = Double.valueOf(br.readLine().trim());
//        String[] values = br.readLine().trim().split(SEPARATOR);
//        for (String str : values) {
//            this.ejb.getEntities().add(new DataEntity(Integer.valueOf(str)));
//        }
    }

    public void setDataFromLines(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            DataEntity entity = new DataEntity();
            String[] values = line.trim().split(SEPARATOR);
//            entity.setNum0(Integer.valueOf(values[0]));
//            entity.setNum1(Integer.valueOf(values[1]));
            entity.setA(Long.valueOf(values[0]));
            entity.setOperand(values[1]);
            entity.setB(Long.valueOf(values[2]));
            this.ejb.getEntities().add(entity);
        }
    }

    public String getResult() {
        String result = null;
        StringBuilder sb = new StringBuilder();
        for (DataEntity entity : this.ejb.getEntities()) {
            if (entity.getOperand().equals("?")) {
                break;
            }
            sb.append(this.calculate(entity));
            sb.append(RETCODE);
        }
        result = sb.toString().trim();
        return result;
    }

    private Long calculate(DataEntity entity) {
        switch (entity.getOperand()) {
            case "+":
                return entity.getA() + entity.getB();
            case "-":
                return entity.getA() - entity.getB();
            case "*":
                return entity.getA() * entity.getB();
            case "/":
                return Math.floorDiv(entity.getA(), entity.getB());
            default:
                return 0L;
        }
    }
}